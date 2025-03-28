package za.ac.cput.repository;


import za.ac.cput.domain.Listing;

import java.net.IDN;
import java.util.List;

public interface IListingRepository extends IRepository<Listing, Integer>
{
    List<Listing> getAll();

}
