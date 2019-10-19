3 -	Agregando un employee:	curl -v -X POST localhost:8080/employees -H 'Content-Type:application/json' -d '{"name": "Santiago Diaz", "role": "gardener"}'
	Borrando el employee:	curl -X DELETE localhost:8080/employees/8

4 -	Diferencias REST vs nonREST: un servicio que maneje operaciones de GET, POST, PUT, DELETE, etc, no es REST si no existen links a objetos relevantes en las operaciones.
	Es decir que se establecen relaciones entre el recurso que se esta utilizando en la operacion, y recursos relevantes para el mismo.
	La creacion de estas relaciones permite que una aplicacion REST pueda crecer y evolucionar sus servicios, se mantienen relaciones o se agregan permitiendo flexibilidad.

5 - Resource Assembler: Esta clase tiene un solo metodo toResource, que recibe un objeto (por ejemplo employee) y lo convierte en un resource, que contiene las relaciones utilizadas en una aplicacion REST.
	Esto permite que el controlador utilice esta clase ResourceAssembler y la implementacion de los Resources sea independiente al controller.
	
6 - Lista de ordenes:		curl -v localhost:8080/orders
	Lista de empleados:		curl -v localhost:8080/employees
	Agregando una orden:	curl -v -X POST localhost:8080/orders -H 'Content-Type:application/json' -d '{"description": "Oneplus 5T"}'
	Completando la orden:	curl -v -X PUT localhost:8080/orders/9/complete
	Agregando otra orden:	curl -v -X POST localhost:8080/orders -H 'Content-Type:application/json' -d '{"description": "Dell XPS"}'
	Cancelando la orden:	curl -v -X DELETE localhost:8080/orders/10/cancel
