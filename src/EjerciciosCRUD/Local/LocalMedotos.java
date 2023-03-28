package EjerciciosCRUD.Local;

import java.util.List;

public class LocalMedotos implements ILocal {
    private List<Local> localList;

    public LocalMedotos() {
        this.localList = localList;
    }


    @Override
    public Local encontrarId(int id) {
        return localList.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Local> encontrarTodo() {
        return localList;
    }

    @Override
    public void guardar(Local local) {
        localList.add(local);

    }

    @Override
    public void actualizar(Local local) {
        Local datosViejos = encontrarId(local.getId());
        if (datosViejos != null){
            localList.remove(datosViejos);
            localList.add(local);
        }

    }

    @Override
    public void borrar(Local local) {
        localList.remove(local);
    }
}
