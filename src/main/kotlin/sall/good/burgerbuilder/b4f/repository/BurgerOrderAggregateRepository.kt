package sall.good.burgerbuilder.b4f.repository

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import sall.good.burgerbuilder.b4f.domain.Order

interface BurgerOrderAggregateRepository : ReactiveMongoRepository<Order, String> {
}