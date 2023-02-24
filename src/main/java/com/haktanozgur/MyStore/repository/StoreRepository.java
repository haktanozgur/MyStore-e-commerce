package com.haktanozgur.MyStore.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.haktanozgur.MyStore.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {

	@Query(value = "select * from products", nativeQuery = true)
	List<Store> findAll();
	@Query(value = "select * from products where product_code  = ?1", nativeQuery = true)
	List<Store> findByProductCode(String code);
  
}
