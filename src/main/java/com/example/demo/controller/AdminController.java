package com.example.demo.controller;

import com.example.demo.model.Role;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@Tag(name = "Administration", description = "All the Groupements and Houses methods")
public class AdminController {



    @GetMapping("/v1/roles")
    @Operation(description = "ADMIN : récupérer la liste des roles : GET /v1/roles")
    @ApiResponses(value = {
                    @ApiResponse(responseCode = "200", description = "SUCCESS"),
                    @ApiResponse(responseCode = "401", description = "not authorized!"),
                    @ApiResponse(responseCode = "403", description = "forbidden!"),
                    @ApiResponse(responseCode = "404", description = "not found!", content = @Content(schema = @Schema(implementation = Role.class) ))})
    public List<Role> recupererListRoles() {
        return null;
    }

    @PutMapping("/v1/user")
    @Operation(description = "ADMIN : Créer un compte utilisateur  (celui du référent de l'entreprise ou celui du commercial) : PUT /v1/user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "401", description = "not authorized!"),
            @ApiResponse(responseCode = "403", description = "forbidden!!!"),
            @ApiResponse(responseCode = "404", description = "not found!!!")})
    public void creerCompteUtilisateur() {}

    @PutMapping("/v1/users/{userId}/Groupements")
    @Operation(description = "ADMIN : Définition des groupements associer à un utilisateur: PUT /v1/users/{userId}/Groupements")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "401", description = "not authorized!"),
            @ApiResponse(responseCode = "403", description = "forbidden!!!"),
            @ApiResponse(responseCode = "404", description = "not found!!!")})
    public void definirGroupementsAAssocier(@PathVariable("userId") String userId) {}

    @PutMapping("/v1/users/{userId}/Groupements/{groupId}/roles")
    @Operation(description = "ADMIN : Associer un rôle à un couple (utilisateur, groupe) : PUT /v1/users/{userId}/Groupements/{groupId}/roles")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "401", description = "not authorized!"),
            @ApiResponse(responseCode = "403", description = "forbidden!!!"),
            @ApiResponse(responseCode = "404", description = "not found!!!")})
    public void associerRole(@PathVariable("userId") String userId, @PathVariable("groupId") String groupId) {}

    @PutMapping("/v1/Groupements/{groupId}/house")
    @Operation(description = "ADMIN : Définir un nouveau house : PUT /v1/Groupements/{groupId}/house")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "401", description = "not authorized!"),
            @ApiResponse(responseCode = "403", description = "forbidden!!!"),
            @ApiResponse(responseCode = "404", description = "not found!!!")})
    public void definirNouveauHouse(@PathVariable("groupId") String groupId) {}

    @PutMapping("/v1/users/{userId}/Houses/{houseId}/roles")
    @Operation(description = "ADMIN : Associer un rôle à un couple (utilisateur, house) : PUT /v1/users/{userId}/Houses/{houseId}/roles")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success|OK"),
            @ApiResponse(responseCode = "401", description = "not authorized!"),
            @ApiResponse(responseCode = "403", description = "forbidden!!!"),
            @ApiResponse(responseCode = "404", description = "not found!!!")})
    public void associerRoleAUtilisateurEtHouse(@PathVariable("userId") String userId, @PathVariable("houseId") String houseId) {}

}
