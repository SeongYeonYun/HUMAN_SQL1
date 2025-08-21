package emp.service;

import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {

    private final EmpDAO empDAO = new EmpDAO();

    public List<EmpDTO> getAllEmp() {
        return empDAO.selectAllEmp();
    }

    public EmpDTO getOneEmp(EmpDTO empDTO) {
        return empDAO.selectOneEmp(empDTO);
    }

    public int removeEmp(EmpDTO empDTO) {
        return empDAO.deleteEmp(empDTO);
    }

    // 수동 empno 삽입
    public int addEmp(EmpDTO empDTO) {
        return empDAO.insertEmp(empDTO);
    }
}
