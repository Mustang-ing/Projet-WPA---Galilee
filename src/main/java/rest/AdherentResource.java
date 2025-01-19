package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.persistence.*;
import java.util.List;
import Class_Definition.Adherent;

@Path("/adherents") // Chemin spécifique pour les adhérents
@Produces(MediaType.APPLICATION_JSON) // Toutes les réponses seront en JSON
@Consumes(MediaType.APPLICATION_JSON) // Toutes les entrées seront en JSON
public class AdherentResource {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");

    // Lister tous les adhérents
    @GET
    public Response getAllAdherents() {
        EntityManager em = emf.createEntityManager();
        try {
            List<Adherent> adherents = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();
            return Response.ok(adherents).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erreur lors de la récupération des adhérents.").build();
        } finally {
            em.close();
        }
    }

    // Ajouter un nouvel adhérent
    @POST
    public Response createAdherent(Adherent adherent) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(adherent);
            em.getTransaction().commit();
            return Response.status(Response.Status.CREATED).entity(adherent).build();
        } catch (Exception e) {
            em.getTransaction().rollback();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erreur lors de l'ajout de l'adhérent.").build();
        } finally {
            em.close();
        }
    }

    // Supprimer un adhérent
    @DELETE
    @Path("/{id}")
    public Response deleteAdherent(@PathParam("id") int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Adherent adherent = em.find(Adherent.class, id);
            if (adherent == null) {
                return Response.status(Response.Status.NOT_FOUND)
                        .entity("Adhérent introuvable avec l'ID : " + id).build();
            }
            em.remove(adherent);
            em.getTransaction().commit();
            return Response.noContent().build();
        } catch (Exception e) {
            em.getTransaction().rollback();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erreur lors de la suppression de l'adhérent.").build();
        } finally {
            em.close();
        }
    }

    @GET
    @Path("/test")
    public Response testApi() {
        return Response.ok("API is working!").build();
    }



}
