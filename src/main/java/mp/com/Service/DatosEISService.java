package mp.com.Service;

import mp.com.model.DatosEIS;
import mp.com.repository.DatosEISRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DatosEISService {

    @Autowired
    private DatosEISRepository datosEISRepository;

    List<DatosEIS> listaDatos = new ArrayList<>();

    public Optional<DatosEIS> datoExiste(Long id){
        Optional<DatosEIS> datoEIS = datosEISRepository.findById(id);
        if(datoEIS.isPresent()){
            return datoEIS;
        }
        return Optional.empty();
    }

    public Optional<DatosEIS> updateEIS(Long id, DatosEIS datosEIS){
        if(datoExiste(id).isEmpty()){
            return datoExiste(id);
        }
        else{
            DatosEIS datos = datoExiste(id).get();
            datos.setAprobadas(datosEIS.getAprobadas());
            datos.setAtm(datosEIS.getAtm());
            datos.setAutorizador(datosEIS.getAutorizador());
            datos.setCampo9(datosEIS.getCampo9());
            datos.setCampo10(datosEIS.getCampo10());
            datos.setEmisor(datosEIS.getEmisor());
            datos.setOtrasRechazadas(datosEIS.getOtrasRechazadas());
            datos.setPeriodo(datosEIS.getPeriodo());
            datos.setTransaccion(datosEIS.getTransaccion());
            datos.setRechazadasFacturables(datosEIS.getRechazadasFacturables());
            return Optional.of(datos);
        }
    }

    public Optional<DatosEIS> buscarPorAtm(String atm){
        Optional<DatosEIS> datoEIS = datosEISRepository.findByAtm(atm);
        if (datoEIS.isEmpty()){
            return Optional.empty();
        }
        return datoEIS;
    }

}
