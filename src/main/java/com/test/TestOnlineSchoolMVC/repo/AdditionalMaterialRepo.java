package com.test.TestOnlineSchoolMVC.repo;

import com.test.TestOnlineSchoolMVC.entity.AdditionalMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalMaterialRepo extends JpaRepository<AdditionalMaterial, Long> {
}
