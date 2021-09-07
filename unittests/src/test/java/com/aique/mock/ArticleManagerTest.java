package com.aique.mock;

import com.aique.entity.Customer;
import com.aique.service.ArticleManager;
import com.aique.service.Database;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArticleManagerTest {

    @Mock
    Database database;

    @Mock
    Customer user;

    @InjectMocks
    private ArticleManager manager;

    @Test
    void shouldDoSomething() {
        // TODO perform some tests with this managers
    }
}
