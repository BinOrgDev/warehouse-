package uz.wsm.dtos;

public record BaseResponseDTO<T>(String id, T result) {
}
