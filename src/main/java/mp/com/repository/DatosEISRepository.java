package mp.com.repository;

import mp.com.model.DatosEIS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface DatosEISRepository extends JpaRepository<DatosEIS, Long> {

    Optional<DatosEIS> findByAtm(String atm);
}
