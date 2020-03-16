package com.db.usersmanagement.service;

import com.db.usersmanagement.entity.Address;

public interface AddressService {

    void createAddress(Address address);

    void viewAddress(Long id);

    void deleteAddress(Long id);
}
