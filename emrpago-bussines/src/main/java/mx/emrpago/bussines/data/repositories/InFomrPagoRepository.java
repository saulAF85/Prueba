package mx.emrpago.bussines.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.emrpago.bussines.data.entities.InFomrPagoEntity;


@Repository
public interface InFomrPagoRepository  extends JpaRepository<InFomrPagoEntity,Long> {

}
