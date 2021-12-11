package com.zahid.builder;

public class PdfDocumentBuilder implements PresentationBuilder{
    private final PdfDocument document = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return document;
    }
}
