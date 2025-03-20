package roshka.diegoduarte.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import roshka.diegoduarte.msscbeerservice.domain.Beer;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto (Beer beer);

    Beer BeerDtoToBeer (BeerDto dto);
}
