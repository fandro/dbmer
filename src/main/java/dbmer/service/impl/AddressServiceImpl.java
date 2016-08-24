package dbmer.service.impl;

import com.yougou.domain.Address;
import dbmer.service.AddressService;
import com.yougou.dao.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fuwb on 16/7/23.
 */
//@Component("userService")
@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(){

    }

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository){
     this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> findAll() {
        return this.addressRepository.findAll();
    }
}
