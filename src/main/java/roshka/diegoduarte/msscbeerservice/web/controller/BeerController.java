package roshka.diegoduarte.msscbeerservice.web.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import roshka.diegoduarte.msscbeerservice.web.model.BeerDto;
import roshka.diegoduarte.msscbeerservice.web.model.BeerPagedList;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        //todo impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@Validated @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeerId(@PathVariable("beerId") UUID beerId,@Validated @RequestBody BeerDto beerDto){
        //todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
