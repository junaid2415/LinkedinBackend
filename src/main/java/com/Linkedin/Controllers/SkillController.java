package com.Linkedin.Controllers;

import com.Linkedin.Entities.Skill;
import com.Linkedin.Services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class SkillController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping("/skills")
    public List<Skill> getSkills(){ return skillsService.getskills();}

    @GetMapping("/skills/{id}")
    public Skill getSkillByID(@PathVariable Long id){ return  skillsService.getSkill(id);}

    @PostMapping("/user/skill/{id}")
    public void postEdu(@RequestBody Skill skill, @PathVariable long id){ skillsService.postSkills(skill,id);}

    @PutMapping("/user/{uid}/skill/{id}")
    public void updateEdu(@RequestBody Skill skill,@PathVariable long id, @PathVariable long uid){ skillsService.updateSkills(skill,id,uid);}

    @DeleteMapping("/skill/{id}")
    public void delEdu(@PathVariable Long id){ skillsService.delSkills(id);}
    

}
