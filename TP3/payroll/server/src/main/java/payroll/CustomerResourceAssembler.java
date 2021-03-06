package payroll;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

@Component
class CustomerResourceAssembler implements ResourceAssembler<Customer, Resource<Customer>> {

	@Override
	public Resource<Customer> toResource(Customer customer) {
		return new Resource<>(customer,
			linkTo(methodOn(CustomerController.class).one(customer.getId())).withSelfRel(),
			linkTo(methodOn(CustomerController.class).all()).withRel("customers"));
	}
}
