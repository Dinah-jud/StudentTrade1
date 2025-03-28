package za.ac.cput.repository;

import za.ac.cput.domain.Listing;
import java.util.ArrayList;
import java.util.List;

public class ListingRepository implements IListingRepository {

    private final List<Listing> listingList = new ArrayList<>();

    @Override
    public List<Listing> getAll() {
        return new ArrayList<>(listingList);  // Return a copy of the list
    }

    @Override
    public Listing create(Listing listing) {
        boolean success = listingList.add(listing);  // Add the listing to the list
        return success ? listing : null;  // Return the listing if added successfully
    }

    @Override
    public Listing read(Integer id) {
        for (Listing listing : listingList) {
            if (listing.getId() == id) {
                return listing;  // Return the listing if found
            }
        }
        return null;  // Return null if not found
    }

    @Override
    public Listing update(Listing listing) {
        Listing existingListing = read(listing.getId());
        if (existingListing == null) {
            return null;  // Return null if the listing doesn't exist
        }

        // Remove the old listing and add the updated one
        boolean success = delete(listing.getId());
        if (success) {
            listingList.add(listing);  // Add the updated listing
            return listing;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Listing listingToDelete = read(id);
        if (listingToDelete == null) {
            return false;  // Return false if the listing doesn't exist
        }
        return listingList.remove(listingToDelete);  // Remove the listing and return true if successful
    }
}
