package hei.example.demo.endpoint.event.consumer.model;

import hei.example.demo.PojaGenerated;
import hei.example.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
