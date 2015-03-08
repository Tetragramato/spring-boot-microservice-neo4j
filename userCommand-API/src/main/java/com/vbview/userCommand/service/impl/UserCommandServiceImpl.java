package com.vbview.userCommand.service.impl;

import com.vbview.database.model.Adress;
import com.vbview.database.model.User;
import com.vbview.database.model.repository.AdressRepository;
import com.vbview.database.model.repository.UserRepository;
import com.vbview.userCommand.service.UserCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tetragramato on 08/03/2015.
 */
@Service
@Transactional
public class UserCommandServiceImpl implements UserCommandService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AdressRepository adressRepository;

    @Override
    public void insertExamplesDateIntoDatabase() {
        User user = new User();
        user.setFirstName("toto");
        user.setLastName("tata");

        Adress adress = new Adress();
        adress.setCodePostal("30900");
        adress.setVille("nimes");
        adress.setLine("Rue scatisse");

        adressRepository.save(adress);

        user.addAdresseDomicile(adress);
        user.addAdresseFacturation(adress);
        user.addAdresseTravail(adress);

        userRepository.save(user);
    }
}
