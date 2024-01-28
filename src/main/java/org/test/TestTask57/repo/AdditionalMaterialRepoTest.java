package org.test.TestTask57.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.TestTask57.entity.AdditionalMaterial;

@Repository
public interface AdditionalMaterialRepoTest extends JpaRepository<AdditionalMaterial, Long> {


}
