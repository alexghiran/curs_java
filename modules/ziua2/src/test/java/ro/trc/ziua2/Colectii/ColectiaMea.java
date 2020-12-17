package ro.trc.ziua2.Colectii;

import ro.trc.ziua2.ExempleString.Telefon;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * exemplu conceptual pentru crearea unei colectii proprii, fara
 * sa ne bazam pe cele deja implementate in JDK
 * */
public class ColectiaMea implements Collection<Telefon> {

    @Override
    public boolean removeIf(Predicate<? super Telefon> filter) {
        return false;
    }

    @Override
    public Spliterator<Telefon> spliterator() {
        return null;
    }

    @Override
    public Stream<Telefon> stream() {
        return null;
    }

    @Override
    public Stream<Telefon> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Telefon> action) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Telefon> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Telefon telefon) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Telefon> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
