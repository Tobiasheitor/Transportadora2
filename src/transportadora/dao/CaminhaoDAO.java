/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import transportadora.dao.exceptions.NonexistentEntityException;
import transportadora.model.Caminhao;

/**
 *
 * @author USUARIO
 */
public class CaminhaoDAO implements Serializable {

    public CaminhaoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Caminhao caminhao) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(caminhao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Caminhao caminhao) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            caminhao = em.merge(caminhao);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = caminhao.getId();
                if (findCaminhao(id) == null) {
                    throw new NonexistentEntityException("The caminhao with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Caminhao caminhao;
            try {
                caminhao = em.getReference(Caminhao.class, id);
                caminhao.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The caminhao with id " + id + " no longer exists.", enfe);
            }
            em.remove(caminhao);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Caminhao> findCaminhaoEntities() {
        return findCaminhaoEntities(true, -1, -1);
    }

    public List<Caminhao> findCaminhaoEntities(int maxResults, int firstResult) {
        return findCaminhaoEntities(false, maxResults, firstResult);
    }

    private List<Caminhao> findCaminhaoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Caminhao.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Caminhao findCaminhao(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Caminhao.class, id);
        } finally {
            em.close();
        }
    }

    public int getCaminhaoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Caminhao> rt = cq.from(Caminhao.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
