package com.example.persistance;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface UserRepository extends CassandraRepository<UserPersistancePojo> {

	@Query(value="SELECT * FROM users WHERE name=?0 ALLOW FILTERING")
	public List<UserPersistancePojo> findByName(String firstname);
 
	@Query("SELECT * FROM users WHERE id=?0 ALLOW FILTERING")
	public List<UserPersistancePojo> findById(int id);
}
