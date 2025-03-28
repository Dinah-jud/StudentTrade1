package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Listing;
import za.ac.cput.factory.ListingFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ListingRepositoryTest {
    private static IListingRepository repository = new ListingRepository();

    private Listing listing = ListingFactory.createListing(1, "Title1", "Description1", LocalDate.now());

    @Test
    void a_create() {
        Listing created = repository.create(listing);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
        Listing read = repository.read(listing.getId());
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void c_update() {
        Listing updatedListing = new Listing.Builder()
                .setId(listing.getId())
                .setTitle("Updated Title")
                .setDescription("Updated Description")
                .setDatedPosted(java.time.LocalDate.now())
                .build();
        Listing updated = repository.update(updatedListing);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(listing.getId()));
        System.out.println("Successfully deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
