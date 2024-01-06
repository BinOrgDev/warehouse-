package uz.wsm.dtos;

public record BaseRequestDTO<T>(String id, T params) {
}
