package mp.com.controller;

import mp.com.Service.DatosEISService;
import mp.com.model.DatosEIS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/datosEIS")
public class DatosEISController {

    @Autowired
    public DatosEISService datosEISService;

    @PutMapping("/update/{id}")
    public void updateEIS(@RequestBody DatosEIS datosEIS, @PathVariable Long id){
        datosEISService.updateEIS(id, datosEIS);
    }

    @GetMapping("/import")
    public void importEIS(@RequestBody DatosEIS datosEIS){

    }

    @GetMapping("/atm/{atm}")
    public void buscarPorAtm(@RequestBody String atm){
        datosEISService.buscarPorAtm(atm);
    }
}
