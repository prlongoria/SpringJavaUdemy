package mx.com.gm;
//Este es un controlador de tipo Rest
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para que Spring reconozca a esta clase debo poner esta notación

@Slf4j //para el manejo de logging

public class InitController {
    //Método:

    @GetMapping("/") //debo poner esta notación para indicar la ruta al siguiente método, en este
    // caso / que es http://localhost:8080

    public String  init(){
        log.info("ejecutanto el controlador rest");  //Esto puedo hacerlo gracias a la notación de manejo de logging.

        log.debug("más detalle del controlador");//Gracias al cambio que hice en application.properties puedo poner este mesnaje

        return "HolaMundo con Spring";
    }
}
