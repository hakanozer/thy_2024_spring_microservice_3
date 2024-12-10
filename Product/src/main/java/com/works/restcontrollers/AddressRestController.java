package com.works.restcontrollers;

import com.works.entities.Address;
import com.works.projections.AddressJoinCity;
import com.works.services.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("product/address")
public class AddressRestController {

    final AddressService addressService;
    public AddressRestController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("save")
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @GetMapping("list")
    public List<AddressJoinCity> list(@RequestParam(defaultValue = "0") int cid) {
        return addressService.findAll(cid);
    }

}
