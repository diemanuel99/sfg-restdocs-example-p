package roshka.diegoduarte.msscbeerservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import roshka.diegoduarte.msscbeerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
