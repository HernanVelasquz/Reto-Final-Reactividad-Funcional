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
    List<Word> mala = Collections.singletonList(new Word());

    private List<String> separateWords(String text){
       return Arrays.stream(text.split(" "))
                .toList();
    }

    public void chatMalasPalabras(String text){
        Flux.fromIterable(separateWords(text))
                .map(word -> Word.obtenerPalabras()
                        .contains(word.toLowerCase())
                        ? "*****" : word)
                .reduce((tem, mensaje) -> tem += " " + mensaje)
                .subscribe(s -> System.out.println(s.toString()));
    }
}
