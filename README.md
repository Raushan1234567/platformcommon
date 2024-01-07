# platformcommon

Entity Layer:

1.Student Entity:
Attributes: name, dateOfBirth, gender, uniqueStudentCode
Relationship: One-to-Many with StudentAddress
StudentAddress Entity:
Attributes: area, state, district, pincode, addressType
Course Entity:
Attributes: courseName, description, courseType, duration, topics
Relationship: Many-to-Many with Student
Repository Layer:

2. StudentRepository: Interface extending JpaRepository for CRUD operations on Student.
CourseRepository: Interface extending JpaRepository for CRUD operations on Course.
Controller Layer:

3. AdminController:
Endpoints for operations 1, 2, 3, 4, 5.
StudentController:
Endpoints for operations 1, 2, 3.
Business Layer (Service):

4. AdminService: Business logic for admin operations.
StudentService: Business logic for student operations.
Security:

Use Spring Security for securing endpoints, allowing only authorized access.




Use Postman to test your API endpoints.
Authentication and Authorization:

Implement authentication for admins and students.
Apply authorization rules to ensure that only authenticated users can perform certain actions.
