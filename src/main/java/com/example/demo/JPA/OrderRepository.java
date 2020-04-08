package com.example.demo.JPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
	/*
	 * @Query(value = "update orders set CUSTOMER_FK=null where ORDERID=?1 ",
	 * nativeQuery = true) void deleteByID(String string);
	 * 
	 * @Query(value = "update orders set CUSTOMER_FK=null where ORDERID=?1 ",
	 * nativeQuery = true) void updateByID(String string);
	 */
	/*
	 * @Query("select o.orderid,o.ordername,c.id,c.name from orders o join o.customers c"
	 * ) List<String[]> findByJoin();
	 */

}
