package com.test.TestOnlineSchoolJPA.repo;

import com.test.TestOnlineSchoolJPA.entity.AdditionalMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalMaterialRepo extends JpaRepository<AdditionalMaterial, Long> {


}
