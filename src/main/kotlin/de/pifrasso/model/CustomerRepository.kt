package de.pifrasso.model

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>