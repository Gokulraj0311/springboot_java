package com.thinkconstructive.restdemo.controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
   CloudVendor cloudVendor;
   @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable String vendorId){
       return cloudVendor;
   }

   @PostMapping
    public String createcloudvendor(@RequestBody  CloudVendor cloudVendor){
       this.cloudVendor=cloudVendor;
       return "Vendor created Succesfully";
   }

   @PutMapping
    public String updatecloudvendor(@RequestBody  CloudVendor cloudVendor){
       this.cloudVendor=cloudVendor;
       return "Updation successfull";
   }
 
   @DeleteMapping("{vendorId}")
    public String deletecloudvendor(@PathVariable String vendorId){
       this.cloudVendor=null;
       return "cloud vendor deletion successfull";
   }
}
