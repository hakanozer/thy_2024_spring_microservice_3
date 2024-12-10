package com.works.services;

import com.works.entities.Address;
import com.works.projections.AddressJoinCity;
import com.works.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    final AddressRepository addressRepository;
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }

    public List<AddressJoinCity> findAll() {
        return addressRepository.joinAddress();
    }

}
