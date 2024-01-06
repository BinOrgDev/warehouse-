package uz.wsm.dtos;

public record BaseErrorResponseDTO(Integer code, String message, Object data) {
}
