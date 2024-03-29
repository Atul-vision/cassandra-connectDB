package com.example.demo.dao;
 
import java.util.List;
 
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.example.demo.model.ArchiveCdRates;
import com.example.demo.model.CdRates;
 
@Repository
public interface CdArchiveRatesRepository extends CassandraRepository<ArchiveCdRates, String> {
	@AllowFiltering
	@Query("SELECT * FROM CdRates WHERE stateCd=?0 ALLOW FILTERING")
	public List<ArchiveCdRates> findByStateName(String stateCd);
 
}