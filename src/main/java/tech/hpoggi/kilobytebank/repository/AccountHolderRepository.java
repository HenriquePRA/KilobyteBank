package tech.hpoggi.kilobytebank.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import tech.hpoggi.kilobytebank.model.Holder;

public class AccountHolderRepository {
    private static Map<Integer, Holder> repository = new HashMap<Integer, Holder>();
    public static Holder findById(Integer id) {
        return repository.get(id);
    }
    public static void save(Holder holder) {
        repository.put(holder.getId(), holder);        
    }
    public static List<Holder> findAll() {
        List<Holder> holders = repository.values().stream().collect(Collectors.toList());
        return holders;
    }
}
