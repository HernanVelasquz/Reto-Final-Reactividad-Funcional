package co.com.sofka.ejerciciodos;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chat {
//    List<Word> mala = Collections.singletonList(new Word());

    /**
     * Metodo encadado de realizar la separacion de datos ingresados por el usuario
     * @param text informacion de los por el usuario
     * @return retorna una lista para poder tratar los datos
     */
    private List<String> separateWords(String text){
       return Arrays.stream(text.split(" "))
                .toList();
    }

    /**
     * Metodo encargado de transformar la informacion de los datos para
     * remplacar los datos por **** de los datos.
     */
    public void chatMalasPalabras(String text){
        Flux.fromIterable(separateWords(text))
                .map(word -> Word.obtenerPalabras()
                        .contains(word.toLowerCase())
                        ? "*****" : word)
                .reduce((tem, mensaje) -> tem += " " + mensaje)
                .subscribe(s -> System.out.println(s.toString()));
    }
}
