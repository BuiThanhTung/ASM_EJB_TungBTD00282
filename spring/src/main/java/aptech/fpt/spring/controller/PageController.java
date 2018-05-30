package aptech.fpt.spring.controller;

import aptech.fpt.spring.model.Attendance_Slots;
import aptech.fpt.spring.model.Attentdance_Details;
import aptech.fpt.spring.repository.Attendance_Detail_Respsitory;
import aptech.fpt.spring.repository.Attendance_Slots_Respsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

@Controller
public class PageController {
    @Autowired
    private Attendance_Slots_Respsitory asModel;

    @Autowired
    private Attendance_Detail_Respsitory adModel;

    @RequestMapping(path = "/AS/list", method = RequestMethod.GET)
    public String getASList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        Page<Attendance_Slots> pagination = asModel.findAll(PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "AS-list";
    }

    @RequestMapping(path = "/AS/detail", method = RequestMethod.GET)
    public String getADList(Model model, @RequestParam int asId, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "5") int limit) {
        Page<Attentdance_Details> pagination = adModel.findAttentdance_DetailsById(asId, PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "AD-list";
    }
}
