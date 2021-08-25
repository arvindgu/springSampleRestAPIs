package com.trip.report.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.report.exception.ResourceNotFoundException;
import com.trip.report.model.AttributesFields;
import com.trip.report.repository.AttributesFieldsRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:8000")
public class AttributesFieldsController {

	@Autowired
    private AttributesFieldsRepository attributesFieldsRepository;
	
	
	@GetMapping("/attributesFields")
    public List < AttributesFields > getAllAttributesFields() {
        return attributesFieldsRepository.findAll();
    }

    @GetMapping("/attributesFields/{id}")
    public ResponseEntity < AttributesFields > getAttributesFieldsById(@PathVariable(value = "id") Long atbrId)
    throws ResourceNotFoundException {
    	AttributesFields employee = attributesFieldsRepository.findById(atbrId)
            .orElseThrow(() -> new ResourceNotFoundException("AttributesFields not found for this id :: " + atbrId));
        return ResponseEntity.ok().body(employee);
    }

    @PostMapping("/attributesFields")
    public AttributesFields createAttributesFields( @RequestBody AttributesFields attributesFields) {
        return attributesFieldsRepository.save(attributesFields);
    }

    @PutMapping("/attributesFields/{id}")
    public ResponseEntity < AttributesFields > updateAttributesFields(@PathVariable(value = "id") Long atbrId,
         @RequestBody AttributesFields attbrFields) throws ResourceNotFoundException {
    	AttributesFields attributesFields = attributesFieldsRepository.findById(atbrId)
            .orElseThrow(() -> new ResourceNotFoundException("AttributesFields not found for this id :: " + atbrId));

    	attributesFields.setName(attbrFields.getName());
    	attributesFields.setCaption(attbrFields.getCaption());
    	attributesFields.setCategory(attbrFields.getCategory());
    	attributesFields.setOrder(attbrFields.getOrder());
    	attributesFields.setDataType(attbrFields.getDataType());
    	attributesFields.setMaxLength(attbrFields.getMaxLength());
    	attributesFields.setDefaultValue(attbrFields.getDefaultValue());
    	attributesFields.setPicklistField(attbrFields.getPicklistField());
    	attributesFields.setHidden(attbrFields.getHidden());
    	attributesFields.setRequired(attbrFields.getRequired());
    	attributesFields.setReadOnly(attbrFields.getReadOnly());
    	
        final AttributesFields updatedAttributesFields = attributesFieldsRepository.save(attributesFields);
        return ResponseEntity.ok(updatedAttributesFields);
    }

    @DeleteMapping("/attributesFields/{id}")
    public Map < String, Boolean > deleteAttributesField(@PathVariable(value = "id") Long atbrId)
    throws ResourceNotFoundException {
    	AttributesFields attributesFields = attributesFieldsRepository.findById(atbrId)
            .orElseThrow(() -> new ResourceNotFoundException("attributesFields not found for this id :: " + atbrId));

        attributesFieldsRepository.delete(attributesFields);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
