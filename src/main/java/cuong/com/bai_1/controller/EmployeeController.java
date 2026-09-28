package cuong.com.bai_1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        // Mock dữ liệu trả về
        List<Map<String, Object>> employees = List.of(
                Map.of("id", 1, "fullName", "Nguyễn Công Hưởng", "salary", 5000.0),
                Map.of("id", 2, "fullName", "Phạm Tuấn Bình", "salary", 5000.0),
                Map.of("id", 3, "fullName", "Nhân viên số 3", "salary", 5000.0)
        );
        return ResponseEntity.ok(employees);
    }
}