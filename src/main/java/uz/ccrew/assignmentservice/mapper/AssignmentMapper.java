package uz.ccrew.assignmentservice.mapper;

import uz.ccrew.assignmentservice.assignment.Assignment;
import uz.ccrew.assignmentservice.dto.assignment.AssignmentSummaryDTO;

import org.springframework.stereotype.Component;

@Component
public class AssignmentMapper implements Mapper<AssignmentSummaryDTO, AssignmentSummaryDTO, Assignment>{
    @Override
    public Assignment toEntity(AssignmentSummaryDTO assignmentSummaryDTO) {
        return null;
    }

    @Override
    public AssignmentSummaryDTO toDTO(Assignment assignment) {
        return AssignmentSummaryDTO.builder()
                .assigmentId(assignment.getAssignmentId())
                .category(assignment.getCategory())
                .date(assignment.getCreatedOn())
                .status(assignment.getStatus())
                .build();
    }
}
