package com.savage.rest_inital.repositories;

import com.savage.rest_inital.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class IUserRepositoryTest {

    @Autowired
    private IUserRepository underTest;

    @Test
    void itShouldFindByPriority() {
        //given
        int priority = 1;
        User user = new User(
                "Cristian Barreto",
                "cristian.savage@outlook.com",
                priority
        );
        var test = underTest.save(user);
        //when
        ArrayList<User> result = underTest.findByPriority(priority);
        //then
        assertThat(result).isNotNull();
        assertThat(result).isExactlyInstanceOf(ArrayList.class);
    }

    @Test
    void itShouldNotFindByPriority() {
        //given
        int failPriority = 1;
        //when
        ArrayList<User> result = underTest.findByPriority(failPriority);
        //then

        assertThat(result).isNotNull();

    }
}