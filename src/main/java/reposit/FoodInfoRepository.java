package reposit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.FoodInfo;

@Repository
public interface FoodInfoRepository extends JpaRepository<FoodInfo, Long> {}
