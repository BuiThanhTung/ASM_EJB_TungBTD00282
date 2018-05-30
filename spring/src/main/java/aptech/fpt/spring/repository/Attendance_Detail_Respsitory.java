package aptech.fpt.spring.repository;

import aptech.fpt.spring.model.Attendance_Slots;
import aptech.fpt.spring.model.Attentdance_Details;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Attendance_Detail_Respsitory extends PagingAndSortingRepository<Attentdance_Details, Integer> {
    Page<Attentdance_Details> findAttentdance_DetailsById(int id, Pageable pageable);
}
