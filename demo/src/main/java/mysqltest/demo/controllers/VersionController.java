package mysqltest.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import mysqltest.demo.models.Version;
import mysqltest.demo.repositories.VersionRepository;

@RestController
@RequestMapping("/version")
public class VersionController {
    
    @Autowired
    private VersionRepository versionRepository;
    
    
    /** 
     * Retrieves a Version by its ID.
     * @param paperId
     * @return Iterable<Version>
     */
    @GetMapping(path="/all/{paperId}")
    public @ResponseBody Iterable<Version> getVersions(@PathVariable String paperId) {
        return versionRepository.findByPaperId(paperId);
    }

}
