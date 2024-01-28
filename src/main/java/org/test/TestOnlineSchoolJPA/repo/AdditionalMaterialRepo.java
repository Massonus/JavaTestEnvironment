package org.test.TestOnlineSchoolJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.TestOnlineSchoolJPA.entity.AdditionalMaterial;

@Repository
public interface AdditionalMaterialRepo extends JpaRepository<AdditionalMaterial, Long> {


}
